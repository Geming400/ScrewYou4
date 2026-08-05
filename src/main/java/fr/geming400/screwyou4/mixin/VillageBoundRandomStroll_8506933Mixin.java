package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.ai.behavior.VillageBoundRandomStroll.class)
public class VillageBoundRandomStroll_8506933Mixin {
        @Inject(at = @At("HEAD"), method = "create(FII)Lnet/minecraft/world/entity/ai/behavior/OneShot;", cancellable = true)
    private static void create__625996551(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-625996551L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "create(F)Lnet/minecraft/world/entity/ai/behavior/OneShot;", cancellable = true)
    private static void create__1013810279(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1013810279L))
            info.setReturnValue(null);
    }


}
