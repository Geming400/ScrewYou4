package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.nbt.TagParser.class)
public class TagParser1376441899Mixin {
        @Inject(at = @At("HEAD"), method = "create(Lcom/mojang/serialization/DynamicOps;)Lnet/minecraft/nbt/TagParser;", cancellable = true)
    private static void create__475208349(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-475208349L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "parseCompoundAsArgument(Lcom/mojang/brigadier/StringReader;)Lnet/minecraft/nbt/CompoundTag;", cancellable = true)
    private static void parseCompoundAsArgument__1034646830(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1034646830L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getOps()Lcom/mojang/serialization/DynamicOps;", cancellable = true)
    private void getOps_541576466(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(541576466L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "parseFully(Lcom/mojang/brigadier/StringReader;)Ljava/lang/Object;", cancellable = true)
    private void parseFully_282937093(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(282937093L))
            info.setReturnValue(new java.lang.Object());
    }

    @Inject(at = @At("HEAD"), method = "parseFully(Ljava/lang/String;)Ljava/lang/Object;", cancellable = true)
    private void parseFully_880250579(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(880250579L))
            info.setReturnValue(new java.lang.Object());
    }

    @Inject(at = @At("HEAD"), method = "parseAsArgument(Lcom/mojang/brigadier/StringReader;)Ljava/lang/Object;", cancellable = true)
    private void parseAsArgument__663660006(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-663660006L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "parseCompoundFully(Ljava/lang/String;)Lnet/minecraft/nbt/CompoundTag;", cancellable = true)
    private static void parseCompoundFully__873515783(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-873515783L))
            info.setReturnValue(new net.minecraft.nbt.CompoundTag());
    }


}
