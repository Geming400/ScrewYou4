package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.block.ColorCollection.class)
public class ColorCollection_1492330653Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_583704384(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(583704384L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__2032213119(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2032213119L))
            info.setReturnValue("f:V?tC");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_2049682743(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2049682743L))
            info.setReturnValue(1363824929);
    }

    @Inject(at = @At("HEAD"), method = "map(Ljava/util/function/Function;)Lnet/minecraft/world/level/block/ColorCollection;", cancellable = true)
    private void map__1411454559(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1411454559L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "forEach(Ljava/util/function/Consumer;)V", cancellable = true)
    private void forEach_1008820451(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1008820451L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "asList()Ljava/util/List;", cancellable = true)
    private void asList_824084156(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(824084156L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "create(Ljava/lang/Object;)Lnet/minecraft/world/level/block/ColorCollection;", cancellable = true)
    private static void create__82593195(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-82593195L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "pick(Lnet/minecraft/world/item/DyeColor;)Ljava/lang/Object;", cancellable = true)
    private void pick__1950021315(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1950021315L))
            info.setReturnValue(new java.lang.Object());
    }

    @Inject(at = @At("HEAD"), method = "red()Ljava/lang/Object;", cancellable = true)
    private void red_222540808(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(222540808L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "white()Ljava/lang/Object;", cancellable = true)
    private void white__623737440(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-623737440L))
            info.setReturnValue(new java.lang.Object());
    }

    @Inject(at = @At("HEAD"), method = "yellow()Ljava/lang/Object;", cancellable = true)
    private void yellow__2057894997(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2057894997L))
            info.setReturnValue(new java.lang.Object());
    }

    @Inject(at = @At("HEAD"), method = "blue()Ljava/lang/Object;", cancellable = true)
    private void blue__1281474799(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1281474799L))
            info.setReturnValue(new java.lang.Object());
    }

    @Inject(at = @At("HEAD"), method = "black()Ljava/lang/Object;", cancellable = true)
    private void black_236856566(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(236856566L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "green()Ljava/lang/Object;", cancellable = true)
    private void green_522488058(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(522488058L))
            info.setReturnValue(new java.lang.Object());
    }

    @Inject(at = @At("HEAD"), method = "cyan()Ljava/lang/Object;", cancellable = true)
    private void cyan_1468708122(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1468708122L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "magenta()Ljava/lang/Object;", cancellable = true)
    private void magenta__2103922144(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2103922144L))
            info.setReturnValue(new java.lang.Object());
    }

    @Inject(at = @At("HEAD"), method = "pink()Ljava/lang/Object;", cancellable = true)
    private void pink_437162797(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(437162797L))
            info.setReturnValue(new java.lang.Object());
    }

    @Inject(at = @At("HEAD"), method = "zipMap(Lnet/minecraft/world/level/block/ColorCollection;Lnet/minecraft/world/level/block/ColorCollection;Ljava/util/function/BiFunction;)Lnet/minecraft/world/level/block/ColorCollection;", cancellable = true)
    private static void zipMap_937001905(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(937001905L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "lime()Ljava/lang/Object;", cancellable = true)
    private void lime_1501438028(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1501438028L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "zipApply(Lnet/minecraft/world/level/block/ColorCollection;Lnet/minecraft/world/level/block/ColorCollection;Ljava/util/function/BiConsumer;)V", cancellable = true)
    private static void zipApply_1089899063(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1089899063L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "purple()Ljava/lang/Object;", cancellable = true)
    private void purple__1821998861(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1821998861L))
            info.setReturnValue(new java.lang.Object());
    }

    @Inject(at = @At("HEAD"), method = "lightGray()Ljava/lang/Object;", cancellable = true)
    private void lightGray_1013415440(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1013415440L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "brown()Ljava/lang/Object;", cancellable = true)
    private void brown__493993235(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-493993235L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "lightBlue()Ljava/lang/Object;", cancellable = true)
    private void lightBlue__28950329(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-28950329L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "orange()Ljava/lang/Object;", cancellable = true)
    private void orange__489988635(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-489988635L))
            info.setReturnValue(new java.lang.Object());
    }

    @Inject(at = @At("HEAD"), method = "gray()Ljava/lang/Object;", cancellable = true)
    private void gray__239109030(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-239109030L))
            info.setReturnValue(new java.lang.Object());
    }

    @Inject(at = @At("HEAD"), method = "registerBlocks(Lnet/minecraft/world/level/block/ColorCollection;Lorg/apache/commons/lang3/function/TriFunction;Ljava/util/function/BiFunction;Ljava/util/function/Function;)Lnet/minecraft/world/level/block/ColorCollection;", cancellable = true)
    private static void registerBlocks_236447427(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(236447427L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "prefixWithColor(Lnet/minecraft/world/level/block/ColorCollection;)Lnet/minecraft/world/level/block/ColorCollection;", cancellable = true)
    private static void prefixWithColor__1055107532(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1055107532L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "registerBlockItems(Lnet/minecraft/world/level/block/ColorCollection;Lnet/minecraft/world/level/block/ColorCollection;Lorg/apache/commons/lang3/function/TriFunction;)Lnet/minecraft/world/level/block/ColorCollection;", cancellable = true)
    private static void registerBlockItems_2861807(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2861807L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "registerItems(Lnet/minecraft/world/level/block/ColorCollection;Ljava/util/function/BiFunction;)Lnet/minecraft/world/level/block/ColorCollection;", cancellable = true)
    private static void registerItems__106026683(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-106026683L))
            info.setReturnValue(null);
    }


}
