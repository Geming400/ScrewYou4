package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.chunk.PalettedContainer.class)
public class PalettedContainer651327146Mixin {
        @Inject(at = @At("HEAD"), method = "get(III)Ljava/lang/Object;", cancellable = true)
    private void get__1727855604(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1727855604L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "copy()Lnet/minecraft/world/level/chunk/PalettedContainer;", cancellable = true)
    private void copy__843421708(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-843421708L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "count(Lnet/minecraft/world/level/chunk/PalettedContainer$CountConsumer;)V", cancellable = true)
    private void count_290391737(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(290391737L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "set(IIILjava/lang/Object;)V", cancellable = true)
    private void set__503770094(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-503770094L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "write(Lnet/minecraft/network/FriendlyByteBuf;)V", cancellable = true)
    private void write_297834025(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(297834025L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getAndSet(IIILjava/lang/Object;)Ljava/lang/Object;", cancellable = true)
    private void getAndSet_1781040688(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1781040688L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "read(Lnet/minecraft/network/FriendlyByteBuf;)V", cancellable = true)
    private void read_297834025(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(297834025L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "release()V", cancellable = true)
    private void release_689601885(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(689601885L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getAll(Ljava/util/function/Consumer;)V", cancellable = true)
    private void getAll_1332343559(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1332343559L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "acquire()V", cancellable = true)
    private void acquire_689601885(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(689601885L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "pack(Lnet/minecraft/world/level/chunk/Strategy;)Lnet/minecraft/world/level/chunk/PalettedContainerRO$PackedData;", cancellable = true)
    private void pack_574536939(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(574536939L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "unpack(Lnet/minecraft/world/level/chunk/Strategy;Lnet/minecraft/world/level/chunk/PalettedContainerRO$PackedData;)Lcom/mojang/serialization/DataResult;", cancellable = true)
    private static void unpack__2034060721(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2034060721L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getSerializedSize()I", cancellable = true)
    private void getSerializedSize_689589392(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(689589392L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "maybeHas(Ljava/util/function/Predicate;)Z", cancellable = true)
    private void maybeHas_721687536(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(721687536L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "forEachInPalette(Ljava/util/function/Consumer;)V", cancellable = true)
    private void forEachInPalette_1332343559(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1332343559L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getAndSetUnchecked(IIILjava/lang/Object;)Ljava/lang/Object;", cancellable = true)
    private void getAndSetUnchecked_1781040688(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1781040688L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "bitsPerEntry()I", cancellable = true)
    private void bitsPerEntry_689589392(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(689589392L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "codecRW(Lcom/mojang/serialization/Codec;Lnet/minecraft/world/level/chunk/Strategy;Ljava/lang/Object;)Lcom/mojang/serialization/Codec;", cancellable = true)
    private static void codecRW_1434849895(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1434849895L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "codecRO(Lcom/mojang/serialization/Codec;Lnet/minecraft/world/level/chunk/Strategy;Ljava/lang/Object;)Lcom/mojang/serialization/Codec;", cancellable = true)
    private static void codecRO_1434849895(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1434849895L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "recreate()Lnet/minecraft/world/level/chunk/PalettedContainer;", cancellable = true)
    private void recreate__843421708(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-843421708L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "onResize(ILjava/lang/Object;)I", cancellable = true)
    private void onResize_1779074661(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1779074661L))
            info.setReturnValue(null);
    }


}
