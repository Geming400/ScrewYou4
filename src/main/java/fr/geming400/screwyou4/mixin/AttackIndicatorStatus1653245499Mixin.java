package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.AttackIndicatorStatus.class)
public class AttackIndicatorStatus1653245499Mixin {
        @Inject(at = @At("HEAD"), method = "values()[Lnet/minecraft/client/AttackIndicatorStatus;", cancellable = true)
    private static void values_902900689(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(902900689L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "valueOf(Ljava/lang/String;)Lnet/minecraft/client/AttackIndicatorStatus;", cancellable = true)
    private static void valueOf__1386872114(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1386872114L))
            info.setReturnValue(net.minecraft.client.AttackIndicatorStatus.HOTBAR);
    }

    @Inject(at = @At("HEAD"), method = "caption()Lnet/minecraft/network/chat/Component;", cancellable = true)
    private void caption__523663666(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-523663666L))
            info.setReturnValue(null);
    }


}
