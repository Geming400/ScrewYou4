package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.commands.arguments.selector.options.EntitySelectorOptions.class)
public class EntitySelectorOptions_594058482Mixin {
        @Inject(at = @At("HEAD"), method = "get(Lnet/minecraft/commands/arguments/selector/EntitySelectorParser;Ljava/lang/String;I)Lnet/minecraft/commands/arguments/selector/options/EntitySelectorOptions$Modifier;", cancellable = true)
    private static void get_1573858824(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1573858824L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "bootStrap()V", cancellable = true)
    private static void bootStrap_1149404942(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1149404942L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "suggestNames(Lnet/minecraft/commands/arguments/selector/EntitySelectorParser;Lcom/mojang/brigadier/suggestion/SuggestionsBuilder;)V", cancellable = true)
    private static void suggestNames_1772233235(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1772233235L))
            info.cancel();
    }


}
