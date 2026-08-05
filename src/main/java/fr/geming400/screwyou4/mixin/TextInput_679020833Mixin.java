package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.server.dialog.input.TextInput.class)
public class TextInput_679020833Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_2064533091(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2064533091L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__456439143(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-456439143L))
            info.setReturnValue("]puG_;6a>rM'}@\u6018h\u856F\u4B00jru924y=xe qK=$\u2103zO1\u0C166xyV9#\u39BA*Y1E6bh@n679Nk5jW5");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_717283574(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(717283574L))
            info.setReturnValue(-178167546);
    }

    @Inject(at = @At("HEAD"), method = "width()I", cancellable = true)
    private void width_717283078(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(717283078L))
            info.setReturnValue(531678850);
    }

    @Inject(at = @At("HEAD"), method = "label()Lnet/minecraft/network/chat/Component;", cancellable = true)
    private void label__1497888333(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1497888333L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "maxLength()I", cancellable = true)
    private void maxLength_717283078(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(717283078L))
            info.setReturnValue(531678850);
    }

    @Inject(at = @At("HEAD"), method = "multiline()Ljava/util/Optional;", cancellable = true)
    private void multiline_924482254(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(924482254L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "initial()Ljava/lang/String;", cancellable = true)
    private void initial__456439639(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-456439639L))
            info.setReturnValue("{2a2\u474Eso'U'7O4fP|");
    }

    @Inject(at = @At("HEAD"), method = "mapCodec()Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private void mapCodec__1880092740(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1880092740L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "labelVisible()Z", cancellable = true)
    private void labelVisible_717299415(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(717299415L))
            info.setReturnValue(false);
    }


}
