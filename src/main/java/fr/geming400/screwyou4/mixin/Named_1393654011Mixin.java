package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.core.HolderSet.Named.class)
public class Named_1393654011Mixin {
        @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_258193539(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(258193539L))
            info.setReturnValue("O3`軖*ቄ:&3OJ2`kAW\"{%XzV?qﮉ5k,mxPK y㚵3{N2}I|$BIqJn嶬ᚃF⹉9`G./^");
    }

    @Inject(at = @At("HEAD"), method = "contains(Lnet/minecraft/core/Holder;)Z", cancellable = true)
    private void contains__1354834304(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1354834304L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "key()Lnet/minecraft/tags/TagKey;", cancellable = true)
    private void key__2053979241(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2053979241L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "unwrap()Lcom/mojang/datafixers/util/Either;", cancellable = true)
    private void unwrap__2078037999(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2078037999L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "isBound()Z", cancellable = true)
    private void isBound_1431932593(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1431932593L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "canSerializeIn(Lnet/minecraft/core/HolderOwner;)Z", cancellable = true)
    private void canSerializeIn_81380053(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(81380053L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "unwrapKey()Ljava/util/Optional;", cancellable = true)
    private void unwrapKey_1639115432(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1639115432L))
            info.setReturnValue(null);
    }


}
