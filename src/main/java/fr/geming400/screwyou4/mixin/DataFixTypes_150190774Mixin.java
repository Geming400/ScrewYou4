package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.util.datafix.DataFixTypes.class)
public class DataFixTypes_150190774Mixin {
        @Inject(at = @At("HEAD"), method = "values()[Lnet/minecraft/util/datafix/DataFixTypes;", cancellable = true)
    private static void values_1920104973(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1920104973L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "update(Lcom/mojang/datafixers/DataFixer;Lcom/mojang/serialization/Dynamic;II)Lcom/mojang/serialization/Dynamic;", cancellable = true)
    private void update_1250414832(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1250414832L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "update(Lcom/mojang/datafixers/DataFixer;Lnet/minecraft/nbt/CompoundTag;II)Lnet/minecraft/nbt/CompoundTag;", cancellable = true)
    private void update__1178278860(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1178278860L))
            info.setReturnValue(new net.minecraft.nbt.CompoundTag());
    }

    @Inject(at = @At("HEAD"), method = "valueOf(Ljava/lang/String;)Lnet/minecraft/util/datafix/DataFixTypes;", cancellable = true)
    private static void valueOf_1926515760(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1926515760L))
            info.setReturnValue(net.minecraft.util.datafix.DataFixTypes.SAVED_DATA_WANDERING_TRADER);
    }

    @Inject(at = @At("HEAD"), method = "wrapCodec(Lcom/mojang/serialization/Codec;Lcom/mojang/datafixers/DataFixer;I)Lcom/mojang/serialization/Codec;", cancellable = true)
    private void wrapCodec_1651252703(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1651252703L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "updateToCurrentVersion(Lcom/mojang/datafixers/DataFixer;Lcom/mojang/serialization/Dynamic;I)Lcom/mojang/serialization/Dynamic;", cancellable = true)
    private void updateToCurrentVersion_1627739579(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1627739579L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "updateToCurrentVersion(Lcom/mojang/datafixers/DataFixer;Lnet/minecraft/nbt/CompoundTag;I)Lnet/minecraft/nbt/CompoundTag;", cancellable = true)
    private void updateToCurrentVersion__1332037729(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1332037729L))
            info.setReturnValue(null);
    }


}
