package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.chunk.SingleValuePalette.class)
public class SingleValuePalette548039286Mixin {
        @Inject(at = @At("HEAD"), method = "copy()Lnet/minecraft/world/level/chunk/Palette;", cancellable = true)
    private void copy__441728632(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-441728632L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "write(Lnet/minecraft/network/FriendlyByteBuf;Lnet/minecraft/core/IdMap;)V", cancellable = true)
    private void write__1983932386(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1983932386L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getSize()I", cancellable = true)
    private void getSize_982166085(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(982166085L))
            info.setReturnValue(1205623254);
    }

    @Inject(at = @At("HEAD"), method = "create(ILjava/util/List;)Lnet/minecraft/world/level/chunk/Palette;", cancellable = true)
    private static void create_1188499195(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1188499195L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "read(Lnet/minecraft/network/FriendlyByteBuf;Lnet/minecraft/core/IdMap;)V", cancellable = true)
    private void read__656212843(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-656212843L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getSerializedSize(Lnet/minecraft/core/IdMap;)I", cancellable = true)
    private void getSerializedSize_1430499563(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1430499563L))
            info.setReturnValue(-1171569176);
    }

    @Inject(at = @At("HEAD"), method = "valueFor(I)Ljava/lang/Object;", cancellable = true)
    private void valueFor__2005277664(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2005277664L))
            info.setReturnValue(new java.lang.Object());
    }

    @Inject(at = @At("HEAD"), method = "idFor(Ljava/lang/Object;Lnet/minecraft/world/level/chunk/PaletteResize;)I", cancellable = true)
    private void idFor__1490619756(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1490619756L))
            info.setReturnValue(762247786);
    }

    @Inject(at = @At("HEAD"), method = "maybeHas(Ljava/util/function/Predicate;)Z", cancellable = true)
    private void maybeHas__1210652310(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1210652310L))
            info.setReturnValue(true);
    }


}
