package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.nbt.NbtUtils.class)
public class NbtUtils_213088909Mixin {
        @Inject(at = @At("HEAD"), method = "readBlockState(Lnet/minecraft/core/HolderGetter;Lnet/minecraft/nbt/CompoundTag;)Lnet/minecraft/world/level/block/state/BlockState;", cancellable = true)
    private static void readBlockState_84052229(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(84052229L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "writeFluidState(Lnet/minecraft/world/level/material/FluidState;)Lnet/minecraft/nbt/CompoundTag;", cancellable = true)
    private static void writeFluidState_1012554534(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1012554534L))
            info.setReturnValue(new net.minecraft.nbt.CompoundTag());
    }

    @Inject(at = @At("HEAD"), method = "writeBlockState(Lnet/minecraft/world/level/block/state/BlockState;)Lnet/minecraft/nbt/CompoundTag;", cancellable = true)
    private static void writeBlockState__254194232(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-254194232L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "prettyPrint(Lnet/minecraft/nbt/Tag;Z)Ljava/lang/String;", cancellable = true)
    private static void prettyPrint_1463175450(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1463175450L))
            info.setReturnValue("N\u480Do  \u5BE15=\uBD86\u9ECAt\uD1CAB3m/n-;nsyp_48\uA15F6{|B+|EIwr('\u5807\u69C8yEd}^V\u6C10>>#p%j\uC97F[g]3]TTIMwL6]Tj");
    }

    @Inject(at = @At("HEAD"), method = "prettyPrint(Ljava/lang/StringBuilder;Lnet/minecraft/nbt/Tag;IZ)Ljava/lang/StringBuilder;", cancellable = true)
    private static void prettyPrint__1010049973(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1010049973L))
            info.setReturnValue(new java.lang.StringBuilder());
    }

    @Inject(at = @At("HEAD"), method = "addCurrentDataVersion(Lnet/minecraft/world/level/storage/ValueOutput;)V", cancellable = true)
    private static void addCurrentDataVersion_706419138(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(706419138L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "addCurrentDataVersion(Lnet/minecraft/nbt/CompoundTag;)Lnet/minecraft/nbt/CompoundTag;", cancellable = true)
    private static void addCurrentDataVersion__1622533219(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1622533219L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "toPrettyComponent(Lnet/minecraft/nbt/Tag;)Lnet/minecraft/network/chat/Component;", cancellable = true)
    private static void toPrettyComponent__945658069(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-945658069L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "snbtToStructure(Ljava/lang/String;)Lnet/minecraft/nbt/CompoundTag;", cancellable = true)
    private static void snbtToStructure__62735205(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-62735205L))
            info.setReturnValue(new net.minecraft.nbt.CompoundTag());
    }

    @Inject(at = @At("HEAD"), method = "structureToSnbt(Lnet/minecraft/nbt/CompoundTag;)Ljava/lang/String;", cancellable = true)
    private static void structureToSnbt__1986158617(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1986158617L))
            info.setReturnValue("WP\u28DAa\u1D8CE\u1B08q?DC(K<9\u3C23_\u3ED2ZgzuQ.JD9}\u6998");
    }

    @Inject(at = @At("HEAD"), method = "compareNbt(Lnet/minecraft/nbt/Tag;Lnet/minecraft/nbt/Tag;Z)Z", cancellable = true)
    private static void compareNbt_212676576(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(212676576L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "getDataVersion(Lnet/minecraft/nbt/CompoundTag;)I", cancellable = true)
    private static void getDataVersion__1733452019(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1733452019L))
            info.setReturnValue(-364099620);
    }

    @Inject(at = @At("HEAD"), method = "getDataVersion(Lnet/minecraft/nbt/CompoundTag;I)I", cancellable = true)
    private static void getDataVersion_27629728(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(27629728L))
            info.setReturnValue(2113153955);
    }

    @Inject(at = @At("HEAD"), method = "getDataVersion(Lcom/mojang/serialization/Dynamic;)I", cancellable = true)
    private static void getDataVersion_1318812176(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1318812176L))
            info.setReturnValue(531892529);
    }

    @Inject(at = @At("HEAD"), method = "getDataVersion(Lcom/mojang/serialization/Dynamic;I)I", cancellable = true)
    private static void getDataVersion_158539261(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(158539261L))
            info.setReturnValue(-691422639);
    }

    @Inject(at = @At("HEAD"), method = "addDataVersion(Lnet/minecraft/nbt/CompoundTag;I)Lnet/minecraft/nbt/CompoundTag;", cancellable = true)
    private static void addDataVersion__2121236739(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2121236739L))
            info.setReturnValue(new net.minecraft.nbt.CompoundTag());
    }

    @Inject(at = @At("HEAD"), method = "addDataVersion(Lcom/mojang/serialization/Dynamic;I)Lcom/mojang/serialization/Dynamic;", cancellable = true)
    private static void addDataVersion__478562855(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-478562855L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "addDataVersion(Lnet/minecraft/world/level/storage/ValueOutput;I)V", cancellable = true)
    private static void addDataVersion__266512498(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-266512498L))
            info.cancel();
    }


}
