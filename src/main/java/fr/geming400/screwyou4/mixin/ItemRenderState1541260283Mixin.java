package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.Display.ItemDisplay.ItemRenderState.class)
public class ItemRenderState1541260283Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_632634015(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(632634015L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__1983283488(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1983283488L))
            info.setReturnValue("\uA133D(u'WLU\u6AEFt1NnIhoS'\uABAC#porhdO\u12C0W,CsP(wIJW%nB}O\u8A34OTFu");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_2098612374(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2098612374L))
            info.setReturnValue(237604438);
    }

    @Inject(at = @At("HEAD"), method = "itemStack()Lnet/minecraft/world/item/ItemStack;", cancellable = true)
    private void itemStack__1047940524(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1047940524L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "itemTransform()Lnet/minecraft/world/item/ItemDisplayContext;", cancellable = true)
    private void itemTransform_649096059(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(649096059L))
            info.setReturnValue(net.minecraft.world.item.ItemDisplayContext.THIRD_PERSON_RIGHT_HAND);
    }


}
