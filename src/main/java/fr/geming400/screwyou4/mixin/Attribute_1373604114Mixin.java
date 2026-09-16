package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.ai.attributes.Attribute.class)
public class Attribute_1373604114Mixin {
        @Inject(at = @At("HEAD"), method = "getDefaultValue()D", cancellable = true)
    private void getDefaultValue_777590220(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(777590220L))
            info.setReturnValue(6.49328200796664E8D);
    }

    @Inject(at = @At("HEAD"), method = "sanitizeValue(D)D", cancellable = true)
    private void sanitizeValue_801538990(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(801538990L))
            info.setReturnValue(6.493282004271193E8D);
    }

    @Inject(at = @At("HEAD"), method = "setSyncable(Z)Lnet/minecraft/world/entity/ai/attributes/Attribute;", cancellable = true)
    private void setSyncable__1120159730(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1120159730L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setSentiment(Lnet/minecraft/world/entity/ai/attributes/Attribute$Sentiment;)Lnet/minecraft/world/entity/ai/attributes/Attribute;", cancellable = true)
    private void setSentiment_863429320(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(863429320L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "isClientSyncable()Z", cancellable = true)
    private void isClientSyncable__1334593058(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1334593058L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "getDescriptionId()Ljava/lang/String;", cancellable = true)
    private void getDescriptionId_36486235(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(36486235L))
            info.setReturnValue("\uA4A3>cFq$gr*JtJcaw Rj>Pb$:(&l#@5JuRM\u9A09%1$b\u5B15:1$;Jk;FuG&D\"%2{mm\u2A40s\u3920");
    }

    @Inject(at = @At("HEAD"), method = "getStyle(Z)Lnet/minecraft/ChatFormatting;", cancellable = true)
    private void getStyle_1249544489(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1249544489L))
            info.setReturnValue(net.minecraft.ChatFormatting.YELLOW);
    }


}
