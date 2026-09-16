package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.color.item.MapColor.class)
public class MapColor453870471Mixin {
        @Inject(at = @At("HEAD"), method = "type()Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private void type__941380183(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-941380183L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__454755797(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-454755797L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_1224293996(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1224293996L))
            info.setReturnValue("im\u3C73*Y=]i:0\u3E5C\uBC31XcSIy89ghQ*1a\u6DE5\u6C462T\uC289U+\u24070:Ok");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1011222562(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1011222562L))
            info.setReturnValue(1216190486);
    }

    @Inject(at = @At("HEAD"), method = "calculate(Lnet/minecraft/world/item/ItemStack;Lnet/minecraft/client/multiplayer/ClientLevel;Lnet/minecraft/world/entity/LivingEntity;)I", cancellable = true)
    private void calculate__766534813(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-766534813L))
            info.setReturnValue(-1479474882);
    }

    @Inject(at = @At("HEAD"), method = "defaultColor()I", cancellable = true)
    private void defaultColor_2003232011(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2003232011L))
            info.setReturnValue(1215698233);
    }


}
