package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.animal.axolotl.Axolotl.Variant.class)
public class Variant_1570503618Mixin {
        @Inject(at = @At("HEAD"), method = "getName()Ljava/lang/String;", cancellable = true)
    private void getName_435043146(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(435043146L))
            info.setReturnValue("F'%R慧P[=(InaGfwE犦;㻿窯J숓e0ཁk5⭉1k.e@ؑ&K}d{,(&bq馂");
    }

    @Inject(at = @At("HEAD"), method = "values()[Lnet/minecraft/world/entity/animal/axolotl/Axolotl$Variant;", cancellable = true)
    private static void values_1855133956(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1855133956L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "valueOf(Ljava/lang/String;)Lnet/minecraft/world/entity/animal/axolotl/Axolotl$Variant;", cancellable = true)
    private static void valueOf_1529858151(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1529858151L))
            info.setReturnValue(net.minecraft.world.entity.animal.axolotl.Axolotl.Variant.WILD);
    }

    @Inject(at = @At("HEAD"), method = "getId()I", cancellable = true)
    private void getId_1608765863(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1608765863L))
            info.setReturnValue(1696855758);
    }

    @Inject(at = @At("HEAD"), method = "byId(I)Lnet/minecraft/world/entity/animal/axolotl/Axolotl$Variant;", cancellable = true)
    private static void byId__330181610(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-330181610L))
            info.setReturnValue(net.minecraft.world.entity.animal.axolotl.Axolotl.Variant.BLUE);
    }

    @Inject(at = @At("HEAD"), method = "getSerializedName()Ljava/lang/String;", cancellable = true)
    private void getSerializedName_435043146(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(435043146L))
            info.setReturnValue("F'%R慧P[=(InaGfwE犦;㻿窯J숓e0ཁk5⭉1k.e@ؑ&K}d{,(&bq馂");
    }

    @Inject(at = @At("HEAD"), method = "getRareSpawnVariant(Lnet/minecraft/util/RandomSource;)Lnet/minecraft/world/entity/animal/axolotl/Axolotl$Variant;", cancellable = true)
    private static void getRareSpawnVariant_379314813(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(379314813L))
            info.setReturnValue(net.minecraft.world.entity.animal.axolotl.Axolotl.Variant.LUCY);
    }

    @Inject(at = @At("HEAD"), method = "getCommonSpawnVariant(Lnet/minecraft/util/RandomSource;)Lnet/minecraft/world/entity/animal/axolotl/Axolotl$Variant;", cancellable = true)
    private static void getCommonSpawnVariant_379314813(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(379314813L))
            info.setReturnValue(net.minecraft.world.entity.animal.axolotl.Axolotl.Variant.LUCY);
    }


}
