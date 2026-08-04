package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.ai.behavior.VillageBoundRandomStroll.class)
public class VillageBoundRandomStroll_8506933Mixin {
        @Inject(at = @At("HEAD"), method = "create(FII)Lnet/minecraft/world/entity/ai/behavior/OneShot;", cancellable = true)
    private static void create__1838147211(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1838147211L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "create(F)Lnet/minecraft/world/entity/ai/behavior/OneShot;", cancellable = true)
    private static void create_1000568597(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1000568597L))
            info.setReturnValue(null);
    }


}
