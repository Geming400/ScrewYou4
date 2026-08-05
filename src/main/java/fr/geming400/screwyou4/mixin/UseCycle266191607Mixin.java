package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.item.properties.numeric.UseCycle.class)
public class UseCycle266191607Mixin {
        @Inject(at = @At("HEAD"), method = "get(Lnet/minecraft/world/item/ItemStack;Lnet/minecraft/client/multiplayer/ClientLevel;Lnet/minecraft/world/entity/ItemOwner;I)F", cancellable = true)
    private void get__744851479(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-744851479L))
            info.setReturnValue(3.862487E8F);
    }

    @Inject(at = @At("HEAD"), method = "type()Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private void type_2002045331(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2002045331L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_1651703866(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1651703866L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__869268368(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-869268368L))
            info.setReturnValue(";r2vq''B_C츐EaK+f탣ᆯlBT≋QA=^Gm('SRc/*_rU衶zwU*eoᡶ+4=唷[O5");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_304454349(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(304454349L))
            info.setReturnValue(1114409789);
    }

    @Inject(at = @At("HEAD"), method = "period()F", cancellable = true)
    private void period_304450970(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(304450970L))
            info.setReturnValue(3.862487E8F);
    }


}
