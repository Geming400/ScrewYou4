package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.storage.loot.predicates.BonusLevelTableCondition.class)
public class BonusLevelTableCondition_21615614Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__887010655(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-887010655L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_792039138(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(792039138L))
            info.setReturnValue("p\u78EA>$65i{,vBMk\u2A33'^\u320B,v3<FvXOpztfQe+r\u1ED7;:MU4C@IhA$'4H\u8209{mnIFZ$gnZbR\u2C11* qxiA&UO,fviS\u5607\u5AFC85)KZQdv\u968F\u17DB");
    }

    @Inject(at = @At("HEAD"), method = "values()Ljava/util/List;", cancellable = true)
    private void values_1199536719(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1199536719L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_578967704(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(578967704L))
            info.setReturnValue(-425553357);
    }

    @Inject(at = @At("HEAD"), method = "test(Lnet/minecraft/world/level/storage/loot/LootContext;)Z", cancellable = true)
    private void test__1383996863(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1383996863L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "test(Ljava/lang/Object;)Z", cancellable = true)
    private void test__1715356098(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1715356098L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "codec()Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private void codec_1088060867(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1088060867L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "enchantment()Lnet/minecraft/core/Holder;", cancellable = true)
    private void enchantment__1111074846(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1111074846L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "bonusLevelFlatChance(Lnet/minecraft/core/Holder;[F)Lnet/minecraft/world/level/storage/loot/predicates/LootItemCondition$Builder;", cancellable = true)
    private static void bonusLevelFlatChance__334976694(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-334976694L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getReferencedContextParams()Ljava/util/Set;", cancellable = true)
    private void getReferencedContextParams_801118841(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(801118841L))
            info.setReturnValue(null);
    }


}
