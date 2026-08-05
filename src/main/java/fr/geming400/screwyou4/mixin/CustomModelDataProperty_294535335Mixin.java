package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.item.properties.select.CustomModelDataProperty.class)
public class CustomModelDataProperty_294535335Mixin {
        @Inject(at = @At("HEAD"), method = "index()I", cancellable = true)
    private void index_332797580(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(332797580L))
            info.setReturnValue(1417051790);
    }

    @Inject(at = @At("HEAD"), method = "get(Lnet/minecraft/world/item/ItemStack;Lnet/minecraft/client/multiplayer/ClientLevel;Lnet/minecraft/world/entity/LivingEntity;ILnet/minecraft/world/item/ItemDisplayContext;)Ljava/lang/Object;", cancellable = true)
    private void get__641868450(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-641868450L))
            info.setReturnValue(new java.lang.Object());
    }

    @Inject(at = @At("HEAD"), method = "get(Lnet/minecraft/world/item/ItemStack;Lnet/minecraft/client/multiplayer/ClientLevel;Lnet/minecraft/world/entity/LivingEntity;ILnet/minecraft/world/item/ItemDisplayContext;)Ljava/lang/String;", cancellable = true)
    private void get_658317196(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(658317196L))
            info.setReturnValue("sg\uB1B8q{;\uBDB6t(+'eFoTM58\uBB0ENyfCi\"CMZPgvgQD%P\u50144n=lj%,fT9/qHbx[gG\uD7E4\u6A5Be\u7523CR]*a;<Bc{\u8C95!\u1F97<a15|[zI>P");
    }

    @Inject(at = @At("HEAD"), method = "type()Lnet/minecraft/client/renderer/item/properties/select/SelectItemModelProperty$Type;", cancellable = true)
    private void type_1498099716(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1498099716L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_1680047593(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1680047593L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__840924641(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-840924641L))
            info.setReturnValue("Dz#?a9\uBDA8\uC80E}\uB139h]\u63A1\u1747\u0C08} 4NdIz5j*0P<:=qpbq>^B\u895C\u9E574{h3\u14E3eRhSB\u9EEEqf,wW%a\uBBE5z%V{|o'i1_\u05B0SPPnD&Q];'");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_332798076(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(332798076L))
            info.setReturnValue(-1578001819);
    }

    @Inject(at = @At("HEAD"), method = "valueCodec()Lcom/mojang/serialization/Codec;", cancellable = true)
    private void valueCodec__97430292(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-97430292L))
            info.setReturnValue(null);
    }


}
