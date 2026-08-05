package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.nbt.NbtUtils.class)
public class NbtUtils_213088909Mixin {
        @Inject(at = @At("HEAD"), method = "addDataVersion(Lnet/minecraft/world/level/storage/ValueOutput;I)V", cancellable = true)
    private static void addDataVersion_1102122971(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1102122971L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "addDataVersion(Lcom/mojang/serialization/Dynamic;I)Lcom/mojang/serialization/Dynamic;", cancellable = true)
    private static void addDataVersion_1745044902(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1745044902L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "addDataVersion(Lnet/minecraft/nbt/CompoundTag;I)Lnet/minecraft/nbt/CompoundTag;", cancellable = true)
    private static void addDataVersion__784257910(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-784257910L))
            info.setReturnValue(new net.minecraft.nbt.CompoundTag());
    }

    @Inject(at = @At("HEAD"), method = "compareNbt(Lnet/minecraft/nbt/Tag;Lnet/minecraft/nbt/Tag;Z)Z", cancellable = true)
    private static void compareNbt__815863483(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-815863483L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "addCurrentDataVersion(Lnet/minecraft/world/level/storage/ValueOutput;)V", cancellable = true)
    private static void addCurrentDataVersion__1006042196(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1006042196L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "addCurrentDataVersion(Lnet/minecraft/nbt/CompoundTag;)Lnet/minecraft/nbt/CompoundTag;", cancellable = true)
    private static void addCurrentDataVersion__1397005305(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1397005305L))
            info.setReturnValue(new net.minecraft.nbt.CompoundTag());
    }

    @Inject(at = @At("HEAD"), method = "structureToSnbt(Lnet/minecraft/nbt/CompoundTag;)Ljava/lang/String;", cancellable = true)
    private static void structureToSnbt__2007117470(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2007117470L))
            info.setReturnValue("3@e\u52F8M\u4036c;I\u4EC7$\u2F4F#Jw\u91BDX\u91F8b");
    }

    @Inject(at = @At("HEAD"), method = "getDataVersion(Lcom/mojang/serialization/Dynamic;)I", cancellable = true)
    private static void getDataVersion__1994560088(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1994560088L))
            info.setReturnValue(1342811359);
    }

    @Inject(at = @At("HEAD"), method = "getDataVersion(Lcom/mojang/serialization/Dynamic;I)I", cancellable = true)
    private static void getDataVersion_523214181(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(523214181L))
            info.setReturnValue(-582220804);
    }

    @Inject(at = @At("HEAD"), method = "getDataVersion(Lnet/minecraft/nbt/CompoundTag;)I", cancellable = true)
    private static void getDataVersion_773984885(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(773984885L))
            info.setReturnValue(-1232874141);
    }

    @Inject(at = @At("HEAD"), method = "getDataVersion(Lnet/minecraft/nbt/CompoundTag;I)I", cancellable = true)
    private static void getDataVersion_448762424(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(448762424L))
            info.setReturnValue(-184152512);
    }

    @Inject(at = @At("HEAD"), method = "toPrettyComponent(Lnet/minecraft/nbt/Tag;)Lnet/minecraft/network/chat/Component;", cancellable = true)
    private static void toPrettyComponent_1885691607(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1885691607L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "prettyPrint(Ljava/lang/StringBuilder;Lnet/minecraft/nbt/Tag;IZ)Ljava/lang/StringBuilder;", cancellable = true)
    private static void prettyPrint__472227582(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-472227582L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "prettyPrint(Lnet/minecraft/nbt/Tag;Z)Ljava/lang/String;", cancellable = true)
    private static void prettyPrint__156453501(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-156453501L))
            info.setReturnValue("5v/T$(dvvl(\u731F&_fx\uAB5ClA2J-I\u4B8EcGK+SJp2c");
    }

    @Inject(at = @At("HEAD"), method = "writeBlockState(Lnet/minecraft/world/level/block/state/BlockState;)Lnet/minecraft/nbt/CompoundTag;", cancellable = true)
    private static void writeBlockState__356628693(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-356628693L))
            info.setReturnValue(new net.minecraft.nbt.CompoundTag());
    }

    @Inject(at = @At("HEAD"), method = "writeFluidState(Lnet/minecraft/world/level/material/FluidState;)Lnet/minecraft/nbt/CompoundTag;", cancellable = true)
    private static void writeFluidState_428291712(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(428291712L))
            info.setReturnValue(new net.minecraft.nbt.CompoundTag());
    }

    @Inject(at = @At("HEAD"), method = "readBlockState(Lnet/minecraft/core/HolderGetter;Lnet/minecraft/nbt/CompoundTag;)Lnet/minecraft/world/level/block/state/BlockState;", cancellable = true)
    private static void readBlockState_180942411(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(180942411L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "snbtToStructure(Ljava/lang/String;)Lnet/minecraft/nbt/CompoundTag;", cancellable = true)
    private static void snbtToStructure__1369295162(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1369295162L))
            info.setReturnValue(new net.minecraft.nbt.CompoundTag());
    }


}
