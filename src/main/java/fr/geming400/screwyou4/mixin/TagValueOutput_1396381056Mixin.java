package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.storage.TagValueOutput.class)
public class TagValueOutput_1396381056Mixin {
        @Inject(at = @At("HEAD"), method = "putBoolean(Ljava/lang/String;Z)V", cancellable = true)
    private void putBoolean__331904885(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-331904885L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "putByte(Ljava/lang/String;B)V", cancellable = true)
    private void putByte__42880751(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-42880751L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "putShort(Ljava/lang/String;S)V", cancellable = true)
    private void putShort__452048744(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-452048744L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "putInt(Ljava/lang/String;I)V", cancellable = true)
    private void putInt__79028159(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-79028159L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "putLong(Ljava/lang/String;J)V", cancellable = true)
    private void putLong_640333453(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(640333453L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "putFloat(Ljava/lang/String;F)V", cancellable = true)
    private void putFloat_1864242411(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1864242411L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "putDouble(Ljava/lang/String;D)V", cancellable = true)
    private void putDouble_1922400284(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1922400284L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "store(Ljava/lang/String;Lcom/mojang/serialization/Codec;Ljava/lang/Object;)V", cancellable = true)
    private void store__1486179042(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1486179042L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "store(Lcom/mojang/serialization/MapCodec;Ljava/lang/Object;)V", cancellable = true)
    private void store_1599045406(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1599045406L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "isEmpty()Z", cancellable = true)
    private void isEmpty__1839469869(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1839469869L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "list(Ljava/lang/String;Lcom/mojang/serialization/Codec;)Lnet/minecraft/world/level/storage/ValueOutput$TypedOutputList;", cancellable = true)
    private void list__525329873(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-525329873L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "child(Ljava/lang/String;)Lnet/minecraft/world/level/storage/ValueOutput;", cancellable = true)
    private void child__501768689(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-501768689L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "discard(Ljava/lang/String;)V", cancellable = true)
    private void discard_651746782(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(651746782L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "createWithContext(Lnet/minecraft/util/ProblemReporter;Lnet/minecraft/core/HolderLookup$Provider;)Lnet/minecraft/world/level/storage/TagValueOutput;", cancellable = true)
    private static void createWithContext__1532996986(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1532996986L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "storeNullable(Ljava/lang/String;Lcom/mojang/serialization/Codec;Ljava/lang/Object;)V", cancellable = true)
    private void storeNullable_162745277(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(162745277L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "putIntArray(Ljava/lang/String;[I)V", cancellable = true)
    private void putIntArray_1397710417(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1397710417L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "childrenList(Ljava/lang/String;)Lnet/minecraft/world/level/storage/ValueOutput$ValueOutputList;", cancellable = true)
    private void childrenList_1831262274(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1831262274L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "buildResult()Lnet/minecraft/nbt/CompoundTag;", cancellable = true)
    private void buildResult_1455188524(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1455188524L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "putString(Ljava/lang/String;Ljava/lang/String;)V", cancellable = true)
    private void putString__1444745786(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1444745786L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "createWithoutContext(Lnet/minecraft/util/ProblemReporter;)Lnet/minecraft/world/level/storage/TagValueOutput;", cancellable = true)
    private static void createWithoutContext_1142747928(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1142747928L))
            info.setReturnValue(null);
    }


}
