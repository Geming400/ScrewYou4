package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.ai.behavior.SpearAttack.SpearStatus.class)
public class SpearStatus785241586Mixin {
        @Inject(at = @At("HEAD"), method = "values()[Lnet/minecraft/world/entity/ai/behavior/SpearAttack$SpearStatus;", cancellable = true)
    private static void values__1636498184(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1636498184L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "valueOf(Ljava/lang/String;)Lnet/minecraft/world/entity/ai/behavior/SpearAttack$SpearStatus;", cancellable = true)
    private static void valueOf__55535489(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-55535489L))
            info.setReturnValue(net.minecraft.world.entity.ai.behavior.SpearAttack.SpearStatus.RETREAT);
    }


}
