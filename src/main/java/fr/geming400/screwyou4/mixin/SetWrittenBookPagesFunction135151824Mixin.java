package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.storage.loot.functions.SetWrittenBookPagesFunction.class)
public class SetWrittenBookPagesFunction135151824Mixin {
        @Inject(at = @At("HEAD"), method = "apply(Lnet/minecraft/world/item/component/WrittenBookContent;)Lnet/minecraft/world/item/component/WrittenBookContent;", cancellable = true)
    private void apply__125984019(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-125984019L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "codec()Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private void codec_1201597078(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1201597078L))
            info.setReturnValue(null);
    }


}
