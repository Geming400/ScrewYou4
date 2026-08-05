package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.commands.arguments.NbtPathArgument.NbtPath.class)
public class NbtPath1189363453Mixin {
        @Inject(at = @At("HEAD"), method = "remove(Lnet/minecraft/nbt/Tag;)I", cancellable = true)
    private void remove__1218165593(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1218165593L))
            info.setReturnValue(300526326);
    }

    @Inject(at = @At("HEAD"), method = "get(Lnet/minecraft/nbt/Tag;)Ljava/util/List;", cancellable = true)
    private void get_1010570967(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1010570967L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_1959786482(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1959786482L))
            info.setReturnValue("B5'YFr+z!>\u7E5Ep8\u642E\u888Am`jVAM+\uD132Jt(P)ymL[Fiq");
    }

    @Inject(at = @At("HEAD"), method = "insert(ILnet/minecraft/nbt/CompoundTag;Ljava/util/List;)I", cancellable = true)
    private void insert__1380054035(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1380054035L))
            info.setReturnValue(59656448);
    }

    @Inject(at = @At("HEAD"), method = "of(Ljava/lang/String;)Lnet/minecraft/commands/arguments/NbtPathArgument$NbtPath;", cancellable = true)
    private static void of__283539975(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-283539975L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "set(Lnet/minecraft/nbt/Tag;Lnet/minecraft/nbt/Tag;)I", cancellable = true)
    private void set_1689651521(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1689651521L))
            info.setReturnValue(-1621267591);
    }

    @Inject(at = @At("HEAD"), method = "getOrCreate(Lnet/minecraft/nbt/Tag;Ljava/util/function/Supplier;)Ljava/util/List;", cancellable = true)
    private void getOrCreate__177432690(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-177432690L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "asString()Ljava/lang/String;", cancellable = true)
    private void asString_222219561(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(222219561L))
            info.setReturnValue("S*LV8\uFB54)0&Fe\u559B _Qx\u8623\"BW\u06FA\u8063\u8857=;jBl\u7C0Br\u97513Q;)cEt\uB33E\u494Bxn_`uU]i");
    }

    @Inject(at = @At("HEAD"), method = "countMatching(Lnet/minecraft/nbt/Tag;)I", cancellable = true)
    private void countMatching_181772879(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(181772879L))
            info.setReturnValue(102225472);
    }

    @Inject(at = @At("HEAD"), method = "isTooDeep(Lnet/minecraft/nbt/Tag;I)Z", cancellable = true)
    private static void isTooDeep_625713359(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(625713359L))
            info.setReturnValue(true);
    }


}
