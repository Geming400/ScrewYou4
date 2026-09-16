package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.item.component.ItemAttributeModifiers.Display.Hidden.class)
public class Hidden2128182855Mixin {
        @Inject(at = @At("HEAD"), method = "type()Lnet/minecraft/world/item/component/ItemAttributeModifiers$Display$Type;", cancellable = true)
    private void type__1280693569(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1280693569L))
            info.setReturnValue(net.minecraft.world.item.component.ItemAttributeModifiers.Display.Type.DEFAULT);
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_1219556587(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1219556587L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__1396360916(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1396360916L))
            info.setReturnValue("j&PHHUm$`VdBr{yAM`\u2F98_;/fgGPL1S\u0214|GsNO%\u1A0D@ai_j3o\u780De%]xtlv58sMS\u4157qJ}mJt<sP\u5CD3\uC021\u766FB8*L\u0455hVEC@PRi\uBCCFhZi");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode__1609432350(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1609432350L))
            info.setReturnValue(-1580262921);
    }

    @Inject(at = @At("HEAD"), method = "apply(Ljava/util/function/Consumer;Lnet/minecraft/world/entity/player/Player;Lnet/minecraft/core/Holder;Lnet/minecraft/world/entity/ai/attributes/AttributeModifier;)V", cancellable = true)
    private void apply_711124510(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(711124510L))
            info.cancel();
    }


}
