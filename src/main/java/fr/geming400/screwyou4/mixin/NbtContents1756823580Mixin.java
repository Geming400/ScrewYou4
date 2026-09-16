package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.network.chat.contents.NbtContents.class)
public class NbtContents1756823580Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_848197312(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(848197312L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__1767720191(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1767720191L))
            info.setReturnValue("z}724nX\u2D1D8\uA618X.HjjBa)J:sEz,i\uD4841\u59CDztR]\u88C4\u2BD2g0\uD6D2T\u79A7\u0A6F K-W>Q\uB5B6");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode__1980791625(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1980791625L))
            info.setReturnValue(245851792);
    }

    @Inject(at = @At("HEAD"), method = "resolve(Lnet/minecraft/network/chat/ResolutionContext;I)Lnet/minecraft/network/chat/MutableComponent;", cancellable = true)
    private void resolve_218277086(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(218277086L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "separator()Ljava/util/Optional;", cancellable = true)
    private void separator_1775252911(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1775252911L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "plain()Z", cancellable = true)
    private void plain__1569404343(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1569404343L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "nbtPath()Lnet/minecraft/util/CompilableString;", cancellable = true)
    private void nbtPath_1198468709(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1198468709L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "codec()Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private void codec__1471698462(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1471698462L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "dataSource()Lnet/minecraft/network/chat/contents/data/DataSource;", cancellable = true)
    private void dataSource_1125776548(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1125776548L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "interpreting()Z", cancellable = true)
    private void interpreting__1187645634(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1187645634L))
            info.setReturnValue(false);
    }


}
