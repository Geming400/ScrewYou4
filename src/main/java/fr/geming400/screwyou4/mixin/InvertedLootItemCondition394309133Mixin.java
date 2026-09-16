package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.storage.loot.predicates.InvertedLootItemCondition.class)
public class InvertedLootItemCondition394309133Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__514317135(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-514317135L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_1164732658(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1164732658L))
            info.setReturnValue("\uB46B>\u4DDECDYm\uB035Gw>ur\uB417WY)X2la'IS(1PO\u16B1NPPsXB\u88A7JZ K)wQ?UpHhi\uB187/<`%\u29AFN=V\u2275@)3HAPv\u7067BcK;m3oZBV\uBFDDccQ\u5F95 :NG@");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_951661224(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(951661224L))
            info.setReturnValue(1143572288);
    }

    @Inject(at = @At("HEAD"), method = "test(Lnet/minecraft/world/level/storage/loot/LootContext;)Z", cancellable = true)
    private void test__1011303343(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1011303343L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "test(Ljava/lang/Object;)Z", cancellable = true)
    private void test__1342662578(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1342662578L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "validate(Lnet/minecraft/world/level/storage/loot/ValidationContext;)V", cancellable = true)
    private void validate__624409638(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-624409638L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "term()Lnet/minecraft/world/level/storage/loot/predicates/LootItemCondition;", cancellable = true)
    private void term__556692671(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-556692671L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "codec()Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private void codec_1460754387(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1460754387L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "invert(Lnet/minecraft/world/level/storage/loot/predicates/LootItemCondition$Builder;)Lnet/minecraft/world/level/storage/loot/predicates/LootItemCondition$Builder;", cancellable = true)
    private static void invert_1828350080(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1828350080L))
            info.setReturnValue(null);
    }


}
