package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.gui.font.providers.TrueTypeGlyphProviderDefinition.class)
public class TrueTypeGlyphProviderDefinition_1172795286Mixin {
        @Inject(at = @At("HEAD"), method = "size()F", cancellable = true)
    private void size_1616523991(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1616523991L))
            info.setReturnValue(1.657399E8F);
    }

    @Inject(at = @At("HEAD"), method = "type()Lnet/minecraft/client/gui/font/providers/GlyphProviderType;", cancellable = true)
    private void type_2130771313(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2130771313L))
            info.setReturnValue(net.minecraft.client.gui.font.providers.GlyphProviderType.SPACE);
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_264169017(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(264169017L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_1943218810(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1943218810L))
            info.setReturnValue("Z`\u615F");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1730147376(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1730147376L))
            info.setReturnValue(-1018487658);
    }

    @Inject(at = @At("HEAD"), method = "location()Lnet/minecraft/resources/Identifier;", cancellable = true)
    private void location_1384921489(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1384921489L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "shift()Lnet/minecraft/client/gui/font/providers/TrueTypeGlyphProviderDefinition$Shift;", cancellable = true)
    private void shift__2092521030(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2092521030L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "skip()Ljava/lang/String;", cancellable = true)
    private void skip__379528355(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-379528355L))
            info.setReturnValue("\u3C9DSPUT\u983EEe5Rr\u575D&!\u9029WK\u1B7E\u5819C1Q_PS=^}\uBD62%<G+C8Z}0c')\uB6856}nk\u3443g/tVH\u1ACBk&z:\u5C01`xD/+\uD35AELwu0*e4k&#w\u708DrJ-f}\u9597,zs>+L\u7E3D\u2DD4Sk");
    }

    @Inject(at = @At("HEAD"), method = "unpack()Lcom/mojang/datafixers/util/Either;", cancellable = true)
    private void unpack__915034566(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-915034566L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "oversample()F", cancellable = true)
    private void oversample__452201094(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-452201094L))
            info.setReturnValue(1.672463E8F);
    }


}
