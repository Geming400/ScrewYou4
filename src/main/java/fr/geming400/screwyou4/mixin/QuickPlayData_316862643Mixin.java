package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.main.GameConfig.QuickPlayData.class)
public class QuickPlayData_316862643Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__591763626(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-591763626L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_1087286167(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1087286167L))
            info.setReturnValue("]QQyd#Di4\"g<\uC9BB\uFF88d&mwn(\u89D0XB\u61BE\u38CE aL1E}V@#rfITegR\u1016\u6744bf\u7056@7<}\u0E0E^]'\u680FMx0B59D");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_874214733(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(874214733L))
            info.setReturnValue(-1661216268);
    }

    @Inject(at = @At("HEAD"), method = "isEnabled()Z", cancellable = true)
    private void isEnabled__1717285358(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1717285358L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "variant()Lnet/minecraft/client/main/GameConfig$QuickPlayVariant;", cancellable = true)
    private void variant_1074191171(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1074191171L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "logPath()Ljava/lang/String;", cancellable = true)
    private void logPath__1237603068(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1237603068L))
            info.setReturnValue("L\u7ADA[{2I\"N+'=F.TGVJ}0LjK)\u466B\u25C6-+\u8EDC1;7\u8BC0ZT/q0[UZ^;RB,\u0BF2#66");
    }


}
