package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.gui.screens.inventory.tooltip.ClientActivePlayersTooltip.ActivePlayersTooltip.class)
public class ActivePlayersTooltip_552945149Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_1938457407(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1938457407L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__582514827(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-582514827L))
            info.setReturnValue("N Q|gzf6m'<\u8426q\u0E582F\u6A24");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_591207890(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(591207890L))
            info.setReturnValue(-2079910295);
    }

    @Inject(at = @At("HEAD"), method = "profiles()Ljava/util/List;", cancellable = true)
    private void profiles__2115685332(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2115685332L))
            info.setReturnValue(null);
    }


}
