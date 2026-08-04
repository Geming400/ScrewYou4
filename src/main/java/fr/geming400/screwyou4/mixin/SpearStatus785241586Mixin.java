package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.ai.behavior.SpearAttack.SpearStatus.class)
public class SpearStatus785241586Mixin {
        @Inject(at = @At("HEAD"), method = "values()[Lnet/minecraft/world/entity/ai/behavior/SpearAttack$SpearStatus;", cancellable = true)
    private static void values_355183834(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(355183834L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "valueOf(Ljava/lang/String;)Lnet/minecraft/world/entity/ai/behavior/SpearAttack$SpearStatus;", cancellable = true)
    private static void valueOf__216784041(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-216784041L))
            info.setReturnValue(null);
    }


}
