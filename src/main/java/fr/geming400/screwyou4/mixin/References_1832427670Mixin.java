package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.util.datafix.fixes.References.class)
public class References_1832427670Mixin {
        @Inject(at = @At("HEAD"), method = "reference(Ljava/lang/String;)Lcom/mojang/datafixers/DSL$TypeReference;", cancellable = true)
    private static void reference__1278141194(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1278141194L))
            info.setReturnValue(null);
    }


}
