package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.ai.behavior.LocateHidingPlace.class)
public class LocateHidingPlace_1830797368Mixin {
        @Inject(at = @At("HEAD"), method = "create(IFI)Lnet/minecraft/world/entity/ai/behavior/OneShot;", cancellable = true)
    private static void create__1515162926(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1515162926L))
            info.setReturnValue(null);
    }


}
