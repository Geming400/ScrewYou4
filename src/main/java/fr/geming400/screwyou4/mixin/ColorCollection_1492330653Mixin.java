package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.block.ColorCollection.class)
public class ColorCollection_1492330653Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__1417124385(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1417124385L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_356870677(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(356870677L))
            info.setReturnValue("{BfZy<&1\u1658,qVcGJKa,(^C+xQLQqLv\u72E9z1}");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1530593394(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1530593394L))
            info.setReturnValue(1127555788);
    }

    @Inject(at = @At("HEAD"), method = "map(Ljava/util/function/Function;)Lnet/minecraft/world/level/block/ColorCollection;", cancellable = true)
    private void map__834518203(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-834518203L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "forEach(Ljava/util/function/Consumer;)V", cancellable = true)
    private void forEach__2121620231(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-2121620231L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "asList()Ljava/util/List;", cancellable = true)
    private void asList__1176299828(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1176299828L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "create(Ljava/lang/Object;)Lnet/minecraft/world/level/block/ColorCollection;", cancellable = true)
    private static void create_998461137(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(998461137L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "pick(Lnet/minecraft/world/item/DyeColor;)Ljava/lang/Object;", cancellable = true)
    private void pick_593071678(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(593071678L))
            info.setReturnValue(new java.lang.Object());
    }

    @Inject(at = @At("HEAD"), method = "red()Ljava/lang/Object;", cancellable = true)
    private void red__943444425(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-943444425L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "black()Ljava/lang/Object;", cancellable = true)
    private void black__943444425(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-943444425L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "blue()Ljava/lang/Object;", cancellable = true)
    private void blue__943444425(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-943444425L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "green()Ljava/lang/Object;", cancellable = true)
    private void green__943444425(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-943444425L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "cyan()Ljava/lang/Object;", cancellable = true)
    private void cyan__943444425(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-943444425L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "magenta()Ljava/lang/Object;", cancellable = true)
    private void magenta__943444425(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-943444425L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "white()Ljava/lang/Object;", cancellable = true)
    private void white__943444425(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-943444425L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "yellow()Ljava/lang/Object;", cancellable = true)
    private void yellow__943444425(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-943444425L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "gray()Ljava/lang/Object;", cancellable = true)
    private void gray__943444425(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-943444425L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "prefixWithColor(Lnet/minecraft/world/level/block/ColorCollection;)Lnet/minecraft/world/level/block/ColorCollection;", cancellable = true)
    private static void prefixWithColor__301460823(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-301460823L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "registerItems(Lnet/minecraft/world/level/block/ColorCollection;Ljava/util/function/BiFunction;)Lnet/minecraft/world/level/block/ColorCollection;", cancellable = true)
    private static void registerItems__423752190(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-423752190L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "registerBlockItems(Lnet/minecraft/world/level/block/ColorCollection;Lnet/minecraft/world/level/block/ColorCollection;Lorg/apache/commons/lang3/function/TriFunction;)Lnet/minecraft/world/level/block/ColorCollection;", cancellable = true)
    private static void registerBlockItems__1987027655(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1987027655L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "lightBlue()Ljava/lang/Object;", cancellable = true)
    private void lightBlue__943444425(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-943444425L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "zipMap(Lnet/minecraft/world/level/block/ColorCollection;Lnet/minecraft/world/level/block/ColorCollection;Ljava/util/function/BiFunction;)Lnet/minecraft/world/level/block/ColorCollection;", cancellable = true)
    private static void zipMap__1518549130(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1518549130L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "purple()Ljava/lang/Object;", cancellable = true)
    private void purple__943444425(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-943444425L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "orange()Ljava/lang/Object;", cancellable = true)
    private void orange__943444425(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-943444425L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "lightGray()Ljava/lang/Object;", cancellable = true)
    private void lightGray__943444425(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-943444425L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "brown()Ljava/lang/Object;", cancellable = true)
    private void brown__943444425(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-943444425L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "pink()Ljava/lang/Object;", cancellable = true)
    private void pink__943444425(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-943444425L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "zipApply(Lnet/minecraft/world/level/block/ColorCollection;Lnet/minecraft/world/level/block/ColorCollection;Ljava/util/function/BiConsumer;)V", cancellable = true)
    private static void zipApply_2111299370(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(2111299370L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "lime()Ljava/lang/Object;", cancellable = true)
    private void lime__943444425(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-943444425L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "registerBlocks(Lnet/minecraft/world/level/block/ColorCollection;Lorg/apache/commons/lang3/function/TriFunction;Ljava/util/function/BiFunction;Ljava/util/function/Function;)Lnet/minecraft/world/level/block/ColorCollection;", cancellable = true)
    private static void registerBlocks__1909817940(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1909817940L))
            info.setReturnValue(null);
    }


}
