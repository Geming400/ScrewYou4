package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.ai.attributes.AttributeModifier.Operation.class)
public class Operation_1173537568Mixin {
        @Inject(at = @At("HEAD"), method = "values()[Lnet/minecraft/world/entity/ai/attributes/AttributeModifier$Operation;", cancellable = true)
    private static void values__35559276(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-35559276L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "valueOf(Ljava/lang/String;)Lnet/minecraft/world/entity/ai/attributes/AttributeModifier$Operation;", cancellable = true)
    private static void valueOf__1048294063(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1048294063L))
            info.setReturnValue(net.minecraft.world.entity.ai.attributes.AttributeModifier.Operation.ADD_VALUE);
    }

    @Inject(at = @At("HEAD"), method = "id()I", cancellable = true)
    private void id_1211799813(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1211799813L))
            info.setReturnValue(-1604159905);
    }

    @Inject(at = @At("HEAD"), method = "getSerializedName()Ljava/lang/String;", cancellable = true)
    private void getSerializedName_38077096(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(38077096L))
            info.setReturnValue("䐋\"y俔y*숢siyYr/?ep#W)L寍>VQ6㦋Y\"J!⛲ᒄ{쨃}qD5EZd<ZG?fs<BE쳊ZDG 㴦뼜-OjI!鱂j9 i,P1");
    }


}
