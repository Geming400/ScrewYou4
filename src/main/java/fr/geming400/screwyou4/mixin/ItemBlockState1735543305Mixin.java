package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.item.properties.select.ItemBlockState.class)
public class ItemBlockState1735543305Mixin {
        @Inject(at = @At("HEAD"), method = "get(Lnet/minecraft/world/item/ItemStack;Lnet/minecraft/client/multiplayer/ClientLevel;Lnet/minecraft/world/entity/LivingEntity;ILnet/minecraft/world/item/ItemDisplayContext;)Ljava/lang/String;", cancellable = true)
    private void get_947414745(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(947414745L))
            info.setReturnValue("5_u1dO\u7F35<\uCC0C[!hDCFj\u9AF2\u5B93)+e\u8346F\u56F1");
    }

    @Inject(at = @At("HEAD"), method = "get(Lnet/minecraft/world/item/ItemStack;Lnet/minecraft/client/multiplayer/ClientLevel;Lnet/minecraft/world/entity/LivingEntity;ILnet/minecraft/world/item/ItemDisplayContext;)Ljava/lang/Object;", cancellable = true)
    private void get__352770901(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-352770901L))
            info.setReturnValue(new java.lang.Object());
    }

    @Inject(at = @At("HEAD"), method = "type()Lnet/minecraft/client/renderer/item/properties/select/SelectItemModelProperty$Type;", cancellable = true)
    private void type__1398605587(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1398605587L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_826917037(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(826917037L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__1789000466(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1789000466L))
            info.setReturnValue("]\u2356|FXYkk\u19F60]f=M>\u04E4E4@W @EJs2\u5C5D\u2BDFrE|4ko4L\u80FB\uA7AEd\u876FD|.\u20D1\u7FA1)(4dQcW}G\u859Bx{!6d4");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode__2002071900(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2002071900L))
            info.setReturnValue(904164135);
    }

    @Inject(at = @At("HEAD"), method = "property()Ljava/lang/String;", cancellable = true)
    private void property_761473447(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(761473447L))
            info.setReturnValue("EWnDJ+J686wCdT*\u0248.[lS9\uFFB7U8^:%7Q-')\u7E32Ukd|+jB8GqL\u44D3\u4719\u4917^(R");
    }

    @Inject(at = @At("HEAD"), method = "valueCodec()Lcom/mojang/serialization/Codec;", cancellable = true)
    private void valueCodec_1769094388(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1769094388L))
            info.setReturnValue(null);
    }


}
