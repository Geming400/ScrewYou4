package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.chunk.PalettedContainer.class)
public class PalettedContainer651327146Mixin {
        @Inject(at = @At("HEAD"), method = "get(III)Ljava/lang/Object;", cancellable = true)
    private void get__258850442(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-258850442L))
            info.setReturnValue(new java.lang.Object());
    }

    @Inject(at = @At("HEAD"), method = "copy()Lnet/minecraft/world/level/chunk/PalettedContainer;", cancellable = true)
    private void copy_1648802015(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1648802015L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "count(Lnet/minecraft/world/level/chunk/PalettedContainer$CountConsumer;)V", cancellable = true)
    private void count_1761417352(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1761417352L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "set(IIILjava/lang/Object;)V", cancellable = true)
    private void set_1813002740(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1813002740L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "write(Lnet/minecraft/network/FriendlyByteBuf;)V", cancellable = true)
    private void write__777659512(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-777659512L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getAndSet(IIILjava/lang/Object;)Ljava/lang/Object;", cancellable = true)
    private void getAndSet_337159567(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(337159567L))
            info.setReturnValue(new java.lang.Object());
    }

    @Inject(at = @At("HEAD"), method = "read(Lnet/minecraft/network/FriendlyByteBuf;)V", cancellable = true)
    private void read__733583681(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-733583681L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "release()V", cancellable = true)
    private void release__1367064138(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1367064138L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getAll(Ljava/util/function/Consumer;)V", cancellable = true)
    private void getAll_788513458(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(788513458L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "acquire()V", cancellable = true)
    private void acquire_365441607(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(365441607L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "pack(Lnet/minecraft/world/level/chunk/Strategy;)Lnet/minecraft/world/level/chunk/PalettedContainerRO$PackedData;", cancellable = true)
    private void pack_648418116(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(648418116L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getSerializedSize()I", cancellable = true)
    private void getSerializedSize_1904066773(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1904066773L))
            info.setReturnValue(-1387130542);
    }

    @Inject(at = @At("HEAD"), method = "unpack(Lnet/minecraft/world/level/chunk/Strategy;Lnet/minecraft/world/level/chunk/PalettedContainerRO$PackedData;)Lcom/mojang/serialization/DataResult;", cancellable = true)
    private static void unpack__1149979427(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1149979427L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "onResize(ILjava/lang/Object;)I", cancellable = true)
    private void onResize__1349087016(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1349087016L))
            info.setReturnValue(891577027);
    }

    @Inject(at = @At("HEAD"), method = "recreate()Lnet/minecraft/world/level/chunk/PalettedContainer;", cancellable = true)
    private void recreate_142952997(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(142952997L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "codecRO(Lcom/mojang/serialization/Codec;Lnet/minecraft/world/level/chunk/Strategy;Ljava/lang/Object;)Lcom/mojang/serialization/Codec;", cancellable = true)
    private static void codecRO__1589031110(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1589031110L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "codecRW(Lcom/mojang/serialization/Codec;Lnet/minecraft/world/level/chunk/Strategy;Ljava/lang/Object;)Lcom/mojang/serialization/Codec;", cancellable = true)
    private static void codecRW__1086271678(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1086271678L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "maybeHas(Ljava/util/function/Predicate;)Z", cancellable = true)
    private void maybeHas__1107364450(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1107364450L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "getAndSetUnchecked(IIILjava/lang/Object;)Ljava/lang/Object;", cancellable = true)
    private void getAndSetUnchecked__481502685(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-481502685L))
            info.setReturnValue(new java.lang.Object());
    }

    @Inject(at = @At("HEAD"), method = "bitsPerEntry()I", cancellable = true)
    private void bitsPerEntry__1726010123(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1726010123L))
            info.setReturnValue(-1580538611);
    }

    @Inject(at = @At("HEAD"), method = "forEachInPalette(Ljava/util/function/Consumer;)V", cancellable = true)
    private void forEachInPalette__367575469(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-367575469L))
            info.cancel();
    }


}
