package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.network.chat.ChatType.Bound.class)
public class Bound_662705442Mixin {
        @Inject(at = @At("HEAD"), method = "name()Lnet/minecraft/network/chat/Component;", cancellable = true)
    private void name_1602302591(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1602302591L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__245920827(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-245920827L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_1433128966(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1433128966L))
            info.setReturnValue("y\uFDFAS_Ip7/u:u'\uBADFF}^\uA9CDJ}MQ\uF9F5G0i[:`id\"ScY\u74AAncMn;{Q\u4DA8\"r>vn\uAE5FN*&bP,y `8\u9FE1t02u8&^/b+\u6B57|\uC726px.dLq<|s\u891F\u5E4AB\u4B5Bb!O\u1070b");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1220057532(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1220057532L))
            info.setReturnValue(-2129511332);
    }

    @Inject(at = @At("HEAD"), method = "targetName()Ljava/util/Optional;", cancellable = true)
    private void targetName__1430568309(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1430568309L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "withTargetName(Lnet/minecraft/network/chat/Component;)Lnet/minecraft/network/chat/ChatType$Bound;", cancellable = true)
    private void withTargetName__1946627959(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1946627959L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "decorateNarration(Lnet/minecraft/network/chat/Component;)Lnet/minecraft/network/chat/Component;", cancellable = true)
    private void decorateNarration_229872181(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(229872181L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "chatType()Lnet/minecraft/core/Holder;", cancellable = true)
    private void chatType_1418464299(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1418464299L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "decorate(Lnet/minecraft/network/chat/Component;)Lnet/minecraft/network/chat/Component;", cancellable = true)
    private void decorate_467546669(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(467546669L))
            info.setReturnValue(null);
    }


}
