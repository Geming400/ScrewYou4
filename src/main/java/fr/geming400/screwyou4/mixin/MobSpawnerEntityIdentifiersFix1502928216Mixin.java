package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.util.datafix.fixes.MobSpawnerEntityIdentifiersFix.class)
public class MobSpawnerEntityIdentifiersFix1502928216Mixin {
        @Inject(at = @At("HEAD"), method = "makeRule()Lcom/mojang/datafixers/TypeRewriteRule;", cancellable = true)
    private void makeRule__1306843245(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1306843245L))
            info.setReturnValue(null);
    }


}
