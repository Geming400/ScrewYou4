package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.nbt.TagParser.class)
public class TagParser1376441899Mixin {
        @Inject(at = @At("HEAD"), method = "create(Lcom/mojang/serialization/DynamicOps;)Lnet/minecraft/nbt/TagParser;", cancellable = true)
    private static void create__855977625(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-855977625L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getOps()Lcom/mojang/serialization/DynamicOps;", cancellable = true)
    private void getOps__653029106(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-653029106L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "parseFully(Lcom/mojang/brigadier/StringReader;)Ljava/lang/Object;", cancellable = true)
    private void parseFully_1082931196(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1082931196L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "parseFully(Ljava/lang/String;)Ljava/lang/Object;", cancellable = true)
    private void parseFully_1288869116(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1288869116L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "parseCompoundFully(Ljava/lang/String;)Lnet/minecraft/nbt/CompoundTag;", cancellable = true)
    private static void parseCompoundFully__205942171(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-205942171L))
            info.setReturnValue(new net.minecraft.nbt.CompoundTag());
    }

    @Inject(at = @At("HEAD"), method = "parseCompoundAsArgument(Lcom/mojang/brigadier/StringReader;)Lnet/minecraft/nbt/CompoundTag;", cancellable = true)
    private static void parseCompoundAsArgument__872362139(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-872362139L))
            info.setReturnValue(new net.minecraft.nbt.CompoundTag());
    }

    @Inject(at = @At("HEAD"), method = "parseAsArgument(Lcom/mojang/brigadier/StringReader;)Ljava/lang/Object;", cancellable = true)
    private void parseAsArgument_1082931196(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1082931196L))
            info.setReturnValue(null);
    }


}
