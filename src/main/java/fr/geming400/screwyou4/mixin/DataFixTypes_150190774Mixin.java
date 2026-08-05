package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.util.datafix.DataFixTypes.class)
public class DataFixTypes_150190774Mixin {
        @Inject(at = @At("HEAD"), method = "values()[Lnet/minecraft/util/datafix/DataFixTypes;", cancellable = true)
    private static void values_2084989871(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2084989871L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "update(Lcom/mojang/datafixers/DataFixer;Lcom/mojang/serialization/Dynamic;II)Lcom/mojang/serialization/Dynamic;", cancellable = true)
    private void update_2106268807(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2106268807L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "update(Lcom/mojang/datafixers/DataFixer;Lnet/minecraft/nbt/CompoundTag;II)Lnet/minecraft/nbt/CompoundTag;", cancellable = true)
    private void update__1783468789(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1783468789L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "valueOf(Ljava/lang/String;)Lnet/minecraft/util/datafix/DataFixTypes;", cancellable = true)
    private static void valueOf__981826552(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-981826552L))
            info.setReturnValue(net.minecraft.util.datafix.DataFixTypes.SAVED_DATA_ENDER_DRAGON_FIGHT);
    }

    @Inject(at = @At("HEAD"), method = "wrapCodec(Lcom/mojang/serialization/Codec;Lcom/mojang/datafixers/DataFixer;I)Lcom/mojang/serialization/Codec;", cancellable = true)
    private void wrapCodec__684860725(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-684860725L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "updateToCurrentVersion(Lcom/mojang/datafixers/DataFixer;Lcom/mojang/serialization/Dynamic;I)Lcom/mojang/serialization/Dynamic;", cancellable = true)
    private void updateToCurrentVersion__882011810(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-882011810L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "updateToCurrentVersion(Lcom/mojang/datafixers/DataFixer;Lnet/minecraft/nbt/CompoundTag;I)Lnet/minecraft/nbt/CompoundTag;", cancellable = true)
    private void updateToCurrentVersion__1372247678(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1372247678L))
            info.setReturnValue(new net.minecraft.nbt.CompoundTag());
    }


}
