package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.item.properties.select.TrimMaterialProperty.class)
public class TrimMaterialProperty468730672Mixin {
        @Inject(at = @At("HEAD"), method = "get(Lnet/minecraft/world/item/ItemStack;Lnet/minecraft/client/multiplayer/ClientLevel;Lnet/minecraft/world/entity/LivingEntity;ILnet/minecraft/world/item/ItemDisplayContext;)Lnet/minecraft/resources/ResourceKey;", cancellable = true)
    private void get__1870638150(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1870638150L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "get(Lnet/minecraft/world/item/ItemStack;Lnet/minecraft/client/multiplayer/ClientLevel;Lnet/minecraft/world/entity/LivingEntity;ILnet/minecraft/world/item/ItemDisplayContext;)Ljava/lang/Object;", cancellable = true)
    private void get__1619583534(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1619583534L))
            info.setReturnValue(new java.lang.Object());
    }

    @Inject(at = @At("HEAD"), method = "type()Lnet/minecraft/client/renderer/item/properties/select/SelectItemModelProperty$Type;", cancellable = true)
    private void type_1629549076(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1629549076L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__439895596(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-439895596L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_1239154197(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1239154197L))
            info.setReturnValue("Oo6|C'A\uB264VdvnY(cl^'#\u5725,G_hEs\u29F19ZcZF\uB979t4\u5774N\u4973$0iH\uA8FF=0a\u6EB1)z'0K\u0E11@XG}\u6657+u\u05DF\u5F281OddO\uA75Doeq\uA808F\u74C8T|??\u746F\u961BE*jY=_|{5\u8517c^H");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1026082763(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1026082763L))
            info.setReturnValue(591200661);
    }

    @Inject(at = @At("HEAD"), method = "valueCodec()Lcom/mojang/serialization/Codec;", cancellable = true)
    private void valueCodec_502281755(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(502281755L))
            info.setReturnValue(null);
    }


}
