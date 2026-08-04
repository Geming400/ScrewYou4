package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.block.state.properties.EnumProperty.class)
public class EnumProperty_602473310Mixin {
        @Inject(at = @At("HEAD"), method = "getName(Ljava/lang/Enum;)Ljava/lang/String;", cancellable = true)
    private void getName_730497804(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(730497804L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getName(Ljava/lang/Comparable;)Ljava/lang/String;", cancellable = true)
    private void getName__568187931(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-568187931L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_1987985072(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1987985072L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getValue(Ljava/lang/String;)Ljava/util/Optional;", cancellable = true)
    private void getValue__1682458431(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1682458431L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "create(Ljava/lang/String;Ljava/lang/Class;Ljava/util/function/Predicate;)Lnet/minecraft/world/level/block/state/properties/EnumProperty;", cancellable = true)
    private static void create__1330926373(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1330926373L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "create(Ljava/lang/String;Ljava/lang/Class;[Ljava/lang/Enum;)Lnet/minecraft/world/level/block/state/properties/EnumProperty;", cancellable = true)
    private static void create__2013695873(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2013695873L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "create(Ljava/lang/String;Ljava/lang/Class;Ljava/util/List;)Lnet/minecraft/world/level/block/state/properties/EnumProperty;", cancellable = true)
    private static void create_1342053437(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1342053437L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "create(Ljava/lang/String;Ljava/lang/Class;)Lnet/minecraft/world/level/block/state/properties/EnumProperty;", cancellable = true)
    private static void create__221408436(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-221408436L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getInternalIndex(Ljava/lang/Comparable;)I", cancellable = true)
    private void getInternalIndex__648534556(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-648534556L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getInternalIndex(Ljava/lang/Enum;)I", cancellable = true)
    private void getInternalIndex__430739363(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-430739363L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "generateHashCode()I", cancellable = true)
    private void generateHashCode_640735555(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(640735555L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getPossibleValues()Ljava/util/List;", cancellable = true)
    private void getPossibleValues__2066157171(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2066157171L))
            info.setReturnValue(null);
    }


}
