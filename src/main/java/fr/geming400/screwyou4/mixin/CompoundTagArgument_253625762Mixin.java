package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.commands.arguments.CompoundTagArgument.class)
public class CompoundTagArgument_253625762Mixin {
        @Inject(at = @At("HEAD"), method = "parse(Lcom/mojang/brigadier/StringReader;)Lnet/minecraft/nbt/CompoundTag;", cancellable = true)
    private void parse__181473706(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-181473706L))
            info.setReturnValue(new net.minecraft.nbt.CompoundTag());
    }

    @Inject(at = @At("HEAD"), method = "parse(Lcom/mojang/brigadier/StringReader;)Ljava/lang/Object;", cancellable = true)
    private void parse_1214885855(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1214885855L))
            info.setReturnValue(new java.lang.Object());
    }

    @Inject(at = @At("HEAD"), method = "compoundTag()Lnet/minecraft/commands/arguments/CompoundTagArgument;", cancellable = true)
    private static void compoundTag_1186918134(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1186918134L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getExamples()Ljava/util/Collection;", cancellable = true)
    private void getExamples_1978239760(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1978239760L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getCompoundTag(Lcom/mojang/brigadier/context/CommandContext;Ljava/lang/String;)Lnet/minecraft/nbt/CompoundTag;", cancellable = true)
    private static void getCompoundTag__279223922(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-279223922L))
            info.setReturnValue(new net.minecraft.nbt.CompoundTag());
    }


}
