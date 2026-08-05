package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.main.GameConfig.QuickPlayRealmsData.class)
public class QuickPlayRealmsData941616241Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__1967838796(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1967838796L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__193843734(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-193843734L))
            info.setReturnValue("Xa\u5D83,5\"^k`\u8282\u72FE*P\u6374M7}\u5217#\u327AOQn&d!Br\uB1F8C||,&K_QD2");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_979878983(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(979878983L))
            info.setReturnValue(2008460471);
    }

    @Inject(at = @At("HEAD"), method = "isEnabled()Z", cancellable = true)
    private void isEnabled_979894824(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(979894824L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "realmId()Ljava/lang/String;", cancellable = true)
    private void realmId__193844230(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-193844230L))
            info.setReturnValue("qH\u6CF2T=f0\uA5A4\u943480=\"]^\u7CF8X\"zeH5/D;%?v[qtT.ED@\u5E00Ox\u787DXC?mUh7PM;s");
    }


}
