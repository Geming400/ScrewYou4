package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.util.datafix.fixes.BlockEntityCustomNameToComponentFix.class)
public class BlockEntityCustomNameToComponentFix_843132687Mixin {
        @Inject(at = @At("HEAD"), method = "fixTagCustomName(Lcom/mojang/serialization/Dynamic;)Lcom/mojang/serialization/Dynamic;", cancellable = true)
    private static void fixTagCustomName__1544716731(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1544716731L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "makeRule()Lcom/mojang/datafixers/TypeRewriteRule;", cancellable = true)
    private void makeRule__1966638775(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1966638775L))
            info.setReturnValue(null);
    }


}
