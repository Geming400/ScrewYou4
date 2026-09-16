package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.server.network.FilteredText.class)
public class FilteredText1573395704Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_664769436(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(664769436L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__1951148067(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1951148067L))
            info.setReturnValue("c\u5891|T18\u7146\u1DD7A{!&");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_2130747795(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2130747795L))
            info.setReturnValue(-1026442616);
    }

    @Inject(at = @At("HEAD"), method = "mask()Lnet/minecraft/network/chat/FilterMask;", cancellable = true)
    private void mask__2073128534(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2073128534L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "raw()Ljava/lang/String;", cancellable = true)
    private void raw__247331159(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-247331159L))
            info.setReturnValue("ANVSJ\u1952\u49BCb");
    }

    @Inject(at = @At("HEAD"), method = "isFiltered()Z", cancellable = true)
    private void isFiltered__572299794(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-572299794L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "fullyFiltered(Ljava/lang/String;)Lnet/minecraft/server/network/FilteredText;", cancellable = true)
    private static void fullyFiltered__540645344(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-540645344L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "filtered()Ljava/lang/String;", cancellable = true)
    private void filtered__506234024(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-506234024L))
            info.setReturnValue("?mPB|\u9311$");
    }

    @Inject(at = @At("HEAD"), method = "filteredOrEmpty()Ljava/lang/String;", cancellable = true)
    private void filteredOrEmpty__771309740(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-771309740L))
            info.setReturnValue("pKVrp'il\u726E*2UZ8b[@\u82897yn'@'!L\u504B\u3635\uD5F6]S^E?Xyy>FAxu+Sx\u7B9989ZfUJn[KM.%=Q)>");
    }

    @Inject(at = @At("HEAD"), method = "passThrough(Ljava/lang/String;)Lnet/minecraft/server/network/FilteredText;", cancellable = true)
    private static void passThrough__1386415859(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1386415859L))
            info.setReturnValue(null);
    }


}
