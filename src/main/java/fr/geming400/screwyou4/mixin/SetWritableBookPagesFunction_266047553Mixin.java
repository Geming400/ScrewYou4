package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.storage.loot.functions.SetWritableBookPagesFunction.class)
public class SetWritableBookPagesFunction_266047553Mixin {
        @Inject(at = @At("HEAD"), method = "apply(Lnet/minecraft/world/item/component/WritableBookContent;)Lnet/minecraft/world/item/component/WritableBookContent;", cancellable = true)
    private void apply__1618834835(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1618834835L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "codec()Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private void codec_1332492806(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1332492806L))
            info.setReturnValue(null);
    }


}
