package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.storage.TagValueOutput.class)
public class TagValueOutput_1396381056Mixin {
        @Inject(at = @At("HEAD"), method = "putBoolean(Ljava/lang/String;Z)V", cancellable = true)
    private void putBoolean__1492029070(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1492029070L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "putByte(Ljava/lang/String;B)V", cancellable = true)
    private void putByte__1514193574(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1514193574L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "putShort(Ljava/lang/String;S)V", cancellable = true)
    private void putShort__1498493717(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1498493717L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "putInt(Ljava/lang/String;I)V", cancellable = true)
    private void putInt__1507728927(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1507728927L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "putLong(Ljava/lang/String;J)V", cancellable = true)
    private void putLong__1506805406(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1506805406L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "putFloat(Ljava/lang/String;F)V", cancellable = true)
    private void putFloat__1510499490(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1510499490L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "putDouble(Ljava/lang/String;D)V", cancellable = true)
    private void putDouble__1512346532(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1512346532L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "store(Ljava/lang/String;Lcom/mojang/serialization/Codec;Ljava/lang/Object;)V", cancellable = true)
    private void store__200034081(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-200034081L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "store(Lcom/mojang/serialization/MapCodec;Ljava/lang/Object;)V", cancellable = true)
    private void store__1423863427(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1423863427L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "isEmpty()Z", cancellable = true)
    private void isEmpty_1434659638(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1434659638L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "list(Ljava/lang/String;Lcom/mojang/serialization/Codec;)Lnet/minecraft/world/level/storage/ValueOutput$TypedOutputList;", cancellable = true)
    private void list__1528908787(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1528908787L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "child(Ljava/lang/String;)Lnet/minecraft/world/level/storage/ValueOutput;", cancellable = true)
    private void child_1289216427(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1289216427L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "putIntArray(Ljava/lang/String;[I)V", cancellable = true)
    private void putIntArray_2106009610(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(2106009610L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "storeNullable(Ljava/lang/String;Lcom/mojang/serialization/Codec;Ljava/lang/Object;)V", cancellable = true)
    private void storeNullable__200034081(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-200034081L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "discard(Ljava/lang/String;)V", cancellable = true)
    private void discard__1746225092(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1746225092L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "createWithContext(Lnet/minecraft/util/ProblemReporter;Lnet/minecraft/core/HolderLookup$Provider;)Lnet/minecraft/world/level/storage/TagValueOutput;", cancellable = true)
    private static void createWithContext_78380441(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(78380441L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "putString(Ljava/lang/String;Ljava/lang/String;)V", cancellable = true)
    private void putString__1966398010(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1966398010L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "childrenList(Ljava/lang/String;)Lnet/minecraft/world/level/storage/ValueOutput$ValueOutputList;", cancellable = true)
    private void childrenList_1390576479(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1390576479L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "buildResult()Lnet/minecraft/nbt/CompoundTag;", cancellable = true)
    private void buildResult__173841865(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-173841865L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createWithoutContext(Lnet/minecraft/util/ProblemReporter;)Lnet/minecraft/world/level/storage/TagValueOutput;", cancellable = true)
    private static void createWithoutContext__1109356299(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1109356299L))
            info.setReturnValue(null);
    }


}
