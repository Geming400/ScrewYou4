package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.item.component.TypedEntityData.class)
public class TypedEntityData1633837145Mixin {
        @Inject(at = @At("HEAD"), method = "type()Ljava/lang/Object;", cancellable = true)
    private void type__801937932(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-801937932L))
            info.setReturnValue(new java.lang.Object());
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__1275618388(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1275618388L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_498376674(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(498376674L))
            info.setReturnValue("/^Y5Y$㒈C䨶{Lz份t8㲂uJ8el=Nfkd<");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1672099391(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1672099391L))
            info.setReturnValue(712498172);
    }

    @Inject(at = @At("HEAD"), method = "of(Ljava/lang/Object;Lnet/minecraft/nbt/CompoundTag;)Lnet/minecraft/world/item/component/TypedEntityData;", cancellable = true)
    private static void of__407417546(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-407417546L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "contains(Ljava/lang/String;)Z", cancellable = true)
    private void contains__1508765158(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1508765158L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "getUnsafe()Lnet/minecraft/nbt/CompoundTag;", cancellable = true)
    private void getUnsafe_63614225(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(63614225L))
            info.setReturnValue(new net.minecraft.nbt.CompoundTag());
    }

    @Inject(at = @At("HEAD"), method = "codec(Lcom/mojang/serialization/Codec;)Lcom/mojang/serialization/Codec;", cancellable = true)
    private static void codec_2117515120(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2117515120L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "streamCodec(Lnet/minecraft/network/codec/StreamCodec;)Lnet/minecraft/network/codec/StreamCodec;", cancellable = true)
    private static void streamCodec__636890660(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-636890660L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "addToTooltip(Lnet/minecraft/world/item/Item$TooltipContext;Ljava/util/function/Consumer;Lnet/minecraft/world/item/TooltipFlag;Lnet/minecraft/core/component/DataComponentGetter;)V", cancellable = true)
    private void addToTooltip__908881245(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-908881245L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "copyTagWithoutId()Lnet/minecraft/nbt/CompoundTag;", cancellable = true)
    private void copyTagWithoutId_63614225(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(63614225L))
            info.setReturnValue(new net.minecraft.nbt.CompoundTag());
    }

    @Inject(at = @At("HEAD"), method = "loadInto(Lnet/minecraft/world/level/block/entity/BlockEntity;Lnet/minecraft/core/HolderLookup$Provider;)Z", cancellable = true)
    private void loadInto__2100747911(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2100747911L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "loadInto(Lnet/minecraft/world/entity/Entity;)V", cancellable = true)
    private void loadInto_1182112485(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1182112485L))
            info.cancel();
    }


}
