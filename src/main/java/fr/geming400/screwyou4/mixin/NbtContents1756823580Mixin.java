package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.network.chat.contents.NbtContents.class)
public class NbtContents1756823580Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__1152631457(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1152631457L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_621363605(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(621363605L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1795086322(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1795086322L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "resolve(Lnet/minecraft/network/chat/ResolutionContext;I)Lnet/minecraft/network/chat/MutableComponent;", cancellable = true)
    private void resolve_1568813810(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1568813810L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "separator()Ljava/util/Optional;", cancellable = true)
    private void separator_2002285002(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2002285002L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "plain()Z", cancellable = true)
    private void plain_1795102163(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1795102163L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "dataSource()Lnet/minecraft/network/chat/contents/data/DataSource;", cancellable = true)
    private void dataSource__568805015(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-568805015L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "codec()Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private void codec__802289992(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-802289992L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "interpreting()Z", cancellable = true)
    private void interpreting_1795102163(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1795102163L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "nbtPath()Lnet/minecraft/util/CompilableString;", cancellable = true)
    private void nbtPath_1591367242(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1591367242L))
            info.setReturnValue(null);
    }


}
