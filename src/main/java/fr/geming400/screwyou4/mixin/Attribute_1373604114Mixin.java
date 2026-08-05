package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.ai.attributes.Attribute.class)
public class Attribute_1373604114Mixin {
        @Inject(at = @At("HEAD"), method = "getDefaultValue()D", cancellable = true)
    private void getDefaultValue_1411861554(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1411861554L))
            info.setReturnValue(2.1977610088442263E8D);
    }

    @Inject(at = @At("HEAD"), method = "getStyle(Z)Lnet/minecraft/ChatFormatting;", cancellable = true)
    private void getStyle__290068732(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-290068732L))
            info.setReturnValue(net.minecraft.ChatFormatting.BLACK);
    }

    @Inject(at = @At("HEAD"), method = "setSyncable(Z)Lnet/minecraft/world/entity/ai/attributes/Attribute;", cancellable = true)
    private void setSyncable_536015141(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(536015141L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setSentiment(Lnet/minecraft/world/entity/ai/attributes/Attribute$Sentiment;)Lnet/minecraft/world/entity/ai/attributes/Attribute;", cancellable = true)
    private void setSentiment__998120421(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-998120421L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "sanitizeValue(D)D", cancellable = true)
    private void sanitizeValue__1712081114(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1712081114L))
            info.setReturnValue(2.1977610016130677E8D);
    }

    @Inject(at = @At("HEAD"), method = "isClientSyncable()Z", cancellable = true)
    private void isClientSyncable_1411882696(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1411882696L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "getDescriptionId()Ljava/lang/String;", cancellable = true)
    private void getDescriptionId_238143642(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(238143642L))
            info.setReturnValue("G*8zZ &L%쥤ÿJ፤M[s躍(蜂>⥃L2h枷&硼q=X?S'eyKFrY:@tY筪@H8}ᴃ<KPv残q-@_-:PW2Dw]7祺:fKIH8c)i셜");
    }


}
