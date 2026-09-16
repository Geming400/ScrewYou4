package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.saveddata.SavedDataType.class)
public class SavedDataType233436781Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__675189983(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-675189983L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_1003859810(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1003859810L))
            info.setReturnValue("(P,;6s'ze:Jd@7Aaf\u0ED9\"l}\uC6B7|C\u059E-#\u9D9C\u4DB7\u1C5D4#*I+GRS!g@nKM\uD1BB m\u49D4K O_ju*=");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_790788376(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(790788376L))
            info.setReturnValue(-1483928503);
    }

    @Inject(at = @At("HEAD"), method = "constructor()Ljava/util/function/Supplier;", cancellable = true)
    private void constructor__1583564044(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1583564044L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "id()Lnet/minecraft/resources/Identifier;", cancellable = true)
    private void id_1935626191(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1935626191L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "dataFixType()Lnet/minecraft/util/datafix/DataFixTypes;", cancellable = true)
    private void dataFixType__1977320671(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1977320671L))
            info.setReturnValue(net.minecraft.util.datafix.DataFixTypes.POI_CHUNK);
    }

    @Inject(at = @At("HEAD"), method = "codec()Lcom/mojang/serialization/Codec;", cancellable = true)
    private void codec__1571272759(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1571272759L))
            info.setReturnValue(null);
    }


}
