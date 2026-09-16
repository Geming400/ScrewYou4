package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.item.component.TypedEntityData.class)
public class TypedEntityData1633837145Mixin {
        @Inject(at = @At("HEAD"), method = "type()Ljava/lang/Object;", cancellable = true)
    private void type__1480495698(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1480495698L))
            info.setReturnValue(new java.lang.Object());
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_725210381(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(725210381L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__1890707122(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1890707122L))
            info.setReturnValue("b\uD0F7");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode__2103778556(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2103778556L))
            info.setReturnValue(-1072268580);
    }

    @Inject(at = @At("HEAD"), method = "of(Ljava/lang/Object;Lnet/minecraft/nbt/CompoundTag;)Lnet/minecraft/world/item/component/TypedEntityData;", cancellable = true)
    private static void of_1403303231(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1403303231L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "contains(Ljava/lang/String;)Z", cancellable = true)
    private void contains_1632643355(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1632643355L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "getUnsafe()Lnet/minecraft/nbt/CompoundTag;", cancellable = true)
    private void getUnsafe_992840437(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(992840437L))
            info.setReturnValue(new net.minecraft.nbt.CompoundTag());
    }

    @Inject(at = @At("HEAD"), method = "copyTagWithoutId()Lnet/minecraft/nbt/CompoundTag;", cancellable = true)
    private void copyTagWithoutId__1833691469(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1833691469L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "codec(Lcom/mojang/serialization/Codec;)Lcom/mojang/serialization/Codec;", cancellable = true)
    private static void codec_1985485958(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1985485958L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "streamCodec(Lnet/minecraft/network/codec/StreamCodec;)Lnet/minecraft/network/codec/StreamCodec;", cancellable = true)
    private static void streamCodec_1163937234(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1163937234L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "addToTooltip(Lnet/minecraft/world/item/Item$TooltipContext;Ljava/util/function/Consumer;Lnet/minecraft/world/item/TooltipFlag;Lnet/minecraft/core/component/DataComponentGetter;)V", cancellable = true)
    private void addToTooltip__741382902(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-741382902L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "loadInto(Lnet/minecraft/world/level/block/entity/BlockEntity;Lnet/minecraft/core/HolderLookup$Provider;)Z", cancellable = true)
    private void loadInto_950504275(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(950504275L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "loadInto(Lnet/minecraft/world/entity/Entity;)V", cancellable = true)
    private void loadInto__1344833205(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1344833205L))
            info.cancel();
    }


}
