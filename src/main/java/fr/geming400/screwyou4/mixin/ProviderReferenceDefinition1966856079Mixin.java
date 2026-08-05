package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.gui.font.providers.ProviderReferenceDefinition.class)
public class ProviderReferenceDefinition1966856079Mixin {
        @Inject(at = @At("HEAD"), method = "type()Lnet/minecraft/client/gui/font/providers/GlyphProviderType;", cancellable = true)
    private void type_170324965(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(170324965L))
            info.setReturnValue(net.minecraft.client.gui.font.providers.GlyphProviderType.REFERENCE);
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__942598958(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-942598958L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_831396104(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(831396104L))
            info.setReturnValue("0zCn\uC86C)\uC63E+j>\u8531t<vu32\u20E1p\u4063T,\uBBD9u=$a)-\u38DAIlCo8# !VThCU");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_2005118821(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2005118821L))
            info.setReturnValue(1029855839);
    }

    @Inject(at = @At("HEAD"), method = "id()Lnet/minecraft/resources/Identifier;", cancellable = true)
    private void id__476210474(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-476210474L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "unpack()Lcom/mojang/datafixers/util/Either;", cancellable = true)
    private void unpack__1504835930(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1504835930L))
            info.setReturnValue(null);
    }


}
