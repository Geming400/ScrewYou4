package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.ai.behavior.BackUpIfTooClose.class)
public class BackUpIfTooClose_1354741957Mixin {
        @Inject(at = @At("HEAD"), method = "create(IF)Lnet/minecraft/world/entity/ai/behavior/OneShot;", cancellable = true)
    private static void create__725742562(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-725742562L))
            info.setReturnValue(null);
    }


}
